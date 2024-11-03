package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ThermometerSnow: ImageVector
    get() {
        if (_thermometerSnow != null) {
            return _thermometerSnow!!
        }
        _thermometerSnow = Builder(name = "ThermometerSnow", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.0f, -1.415f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.585f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 12.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(7.55f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -5.0f, 0.0f)
                close()
                moveTo(3.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 2.5f)
                verticalLineToRelative(7.987f)
                lineToRelative(-0.167f, 0.15f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 3.333f, 0.0f)
                lineTo(5.0f, 10.486f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 1.0f)
                moveToRelative(5.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
                lineTo(9.0f, 5.207f)
                verticalLineToRelative(1.927f)
                lineToRelative(1.669f, -0.963f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.237f, 0.882f)
                lineToRelative(1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.866f)
                lineToRelative(-1.12f, 0.646f)
                lineToRelative(0.884f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineTo(9.5f, 8.0f)
                lineToRelative(1.669f, 0.963f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.258f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.866f)
                lineToRelative(-1.12f, -0.646f)
                lineToRelative(0.237f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.966f, 0.258f)
                lineTo(10.67f, 9.83f)
                lineTo(9.0f, 8.866f)
                verticalLineToRelative(1.927f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(9.0f, 12.207f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _thermometerSnow!!
    }

private var _thermometerSnow: ImageVector? = null
