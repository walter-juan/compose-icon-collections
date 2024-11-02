package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Sui: ImageVector
    get() {
        if (_sui != null) {
            return _sui!!
        }
        _sui = Builder(name = "Sui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.636f, 10.009f)
                arcToRelative(7.16f, 7.16f, 0.0f, false, true, 1.565f, 4.474f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, -1.608f, 4.53f)
                lineToRelative(-0.087f, 0.106f)
                lineToRelative(-0.023f, -0.135f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.07f, -0.349f)
                curveToRelative(-0.502f, -2.21f, -2.142f, -4.106f, -4.84f, -5.642f)
                curveToRelative(-1.823f, -1.034f, -2.866f, -2.278f, -3.14f, -3.693f)
                curveToRelative(-0.177f, -0.915f, -0.046f, -1.834f, 0.209f, -2.62f)
                curveToRelative(0.254f, -0.787f, 0.631f, -1.446f, 0.953f, -1.843f)
                lineToRelative(1.05f, -1.284f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.713f, 0.0f)
                lineToRelative(5.28f, 6.456f)
                close()
                moveTo(19.296f, 8.726f)
                lineTo(12.26f, 0.123f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, false, -0.52f, 0.0f)
                lineTo(4.704f, 8.726f)
                lineToRelative(-0.023f, 0.029f)
                arcToRelative(9.33f, 9.33f, 0.0f, false, false, -2.07f, 5.872f)
                curveTo(2.612f, 19.803f, 6.816f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(9.388f, -4.197f, 9.388f, -9.373f)
                arcToRelative(9.32f, 9.32f, 0.0f, false, false, -2.07f, -5.871f)
                close()
                moveTo(6.389f, 9.981f)
                lineToRelative(0.63f, -0.77f)
                lineToRelative(0.018f, 0.142f)
                quadToRelative(0.023f, 0.17f, 0.055f, 0.34f)
                curveToRelative(0.408f, 2.136f, 1.862f, 3.917f, 4.294f, 5.297f)
                curveToRelative(2.114f, 1.203f, 3.345f, 2.586f, 3.7f, 4.103f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, 0.109f, 1.801f)
                lineToRelative(-0.004f, 0.034f)
                lineToRelative(-0.03f, 0.014f)
                arcTo(7.2f, 7.2f, 0.0f, false, true, 12.0f, 21.67f)
                curveToRelative(-3.976f, 0.0f, -7.2f, -3.218f, -7.2f, -7.188f)
                curveToRelative(0.0f, -1.705f, 0.594f, -3.27f, 1.587f, -4.503f)
                close()
            }
        }
        .build()
        return _sui!!
    }

private var _sui: ImageVector? = null
