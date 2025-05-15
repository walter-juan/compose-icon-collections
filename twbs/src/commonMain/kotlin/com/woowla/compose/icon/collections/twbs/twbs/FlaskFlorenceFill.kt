package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FlaskFlorenceFill: ImageVector
    get() {
        if (_flaskFlorenceFill != null) {
            return _flaskFlorenceFill!!
        }
        _flaskFlorenceFill = Builder(name = "FlaskFlorenceFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 0.0f)
                lineToRelative(0.1f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.1f, 0.99f)
                lineTo(10.0f, 1.0f)
                verticalLineToRelative(5.417f)
                curveToRelative(0.517f, 0.226f, 0.986f, 0.538f, 1.394f, 0.916f)
                lineToRelative(0.043f, 0.038f)
                lineToRelative(0.14f, 0.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.303f, 0.34f)
                lineToRelative(0.101f, 0.128f)
                quadToRelative(0.045f, 0.06f, 0.088f, 0.122f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.26f, 0.4f)
                lineToRelative(0.066f, 0.12f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.16f, 0.32f)
                quadToRelative(0.029f, 0.062f, 0.053f, 0.124f)
                quadToRelative(0.035f, 0.08f, 0.067f, 0.163f)
                quadToRelative(0.115f, 0.3f, 0.19f, 0.62f)
                lineToRelative(0.024f, 0.111f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.096f, 0.68f)
                quadTo(13.0f, 10.82f, 13.0f, 11.0f)
                lineToRelative(-0.007f, 0.257f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 16.0f)
                lineToRelative(-0.257f, -0.007f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 6.417f)
                lineTo(6.0f, 1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(8.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.065f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.0f, 6.756f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(8.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 2.0f)
                close()
            }
        }
        .build()
        return _flaskFlorenceFill!!
    }

private var _flaskFlorenceFill: ImageVector? = null
