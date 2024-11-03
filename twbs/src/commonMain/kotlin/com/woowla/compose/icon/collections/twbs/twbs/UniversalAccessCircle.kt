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

public val Twbs.UniversalAccessCircle: ImageVector
    get() {
        if (_universalAccessCircle != null) {
            return _universalAccessCircle!!
        }
        _universalAccessCircle = Builder(name = "UniversalAccessCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.143f)
                arcTo(1.071f, 1.071f, 0.0f, true, false, 8.0f, 2.0f)
                arcToRelative(1.071f, 1.071f, 0.0f, false, false, 0.0f, 2.143f)
                moveToRelative(-4.668f, 1.47f)
                lineToRelative(3.24f, 0.316f)
                verticalLineToRelative(2.5f)
                lineToRelative(-0.323f, 4.585f)
                arcTo(0.383f, 0.383f, 0.0f, false, false, 7.0f, 13.14f)
                lineToRelative(0.826f, -4.017f)
                curveToRelative(0.045f, -0.18f, 0.301f, -0.18f, 0.346f, 0.0f)
                lineTo(9.0f, 13.139f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, false, 0.752f, -0.125f)
                lineTo(9.43f, 8.43f)
                verticalLineToRelative(-2.5f)
                lineToRelative(3.239f, -0.316f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.047f, -0.756f)
                horizontalLineTo(3.379f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.047f, 0.756f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.0f, 8.0f)
            }
        }
        .build()
        return _universalAccessCircle!!
    }

private var _universalAccessCircle: ImageVector? = null
