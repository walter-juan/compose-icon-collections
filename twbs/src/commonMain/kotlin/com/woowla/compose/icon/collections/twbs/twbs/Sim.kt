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

public val Twbs.Sim: ImageVector
    get() {
        if (_sim != null) {
            return _sim!!
        }
        _sim = Builder(name = "Sim", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.915f, 1.914f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 3.414f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 14.5f)
                close()
                moveTo(3.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(3.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.353f)
                lineToRelative(-1.915f, -1.915f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.586f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(8.5f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(8.5f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(7.5f, 12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                close()
                moveTo(4.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 4.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 11.5f)
                close()
            }
        }
        .build()
        return _sim!!
    }

private var _sim: ImageVector? = null
