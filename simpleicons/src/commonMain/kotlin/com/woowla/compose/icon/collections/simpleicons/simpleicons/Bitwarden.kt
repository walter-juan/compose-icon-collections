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

public val Simpleicons.Bitwarden: ImageVector
    get() {
        if (_bitwarden != null) {
            return _bitwarden!!
        }
        _bitwarden = Builder(name = "Bitwarden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.722f, 0.296f)
                arcTo(0.964f, 0.964f, 0.0f, false, false, 21.018f, 0.0f)
                lineTo(2.982f, 0.0f)
                arcToRelative(0.959f, 0.959f, 0.0f, false, false, -0.703f, 0.296f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -0.297f, 0.702f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.895f, 0.174f, 1.783f, 0.523f, 2.665f)
                curveToRelative(0.349f, 0.88f, 0.783f, 1.66f, 1.3f, 2.345f)
                curveToRelative(0.517f, 0.68f, 1.132f, 1.346f, 1.848f, 1.993f)
                arcToRelative(21.807f, 21.807f, 0.0f, false, false, 1.98f, 1.609f)
                curveToRelative(0.605f, 0.427f, 1.235f, 0.83f, 1.893f, 1.212f)
                curveToRelative(0.657f, 0.381f, 1.125f, 0.638f, 1.4f, 0.772f)
                curveToRelative(0.276f, 0.134f, 0.5f, 0.241f, 0.664f, 0.311f)
                arcToRelative(0.916f, 0.916f, 0.0f, false, false, 0.814f, 0.0f)
                curveToRelative(0.168f, -0.073f, 0.389f, -0.177f, 0.667f, -0.311f)
                curveToRelative(0.275f, -0.134f, 0.743f, -0.394f, 1.401f, -0.772f)
                arcToRelative(25.305f, 25.305f, 0.0f, false, false, 1.894f, -1.212f)
                arcTo(21.891f, 21.891f, 0.0f, false, false, 18.348f, 20.0f)
                curveToRelative(0.716f, -0.647f, 1.33f, -1.31f, 1.847f, -1.993f)
                reflectiveCurveToRelative(0.949f, -1.463f, 1.3f, -2.345f)
                curveToRelative(0.35f, -0.879f, 0.524f, -1.767f, 0.524f, -2.665f)
                lineTo(22.019f, 1.001f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.297f, -0.705f)
                close()
                moveTo(19.397f, 13.111f)
                curveToRelative(0.0f, 4.344f, -7.397f, 8.087f, -7.397f, 8.087f)
                lineTo(12.0f, 2.57f)
                horizontalLineToRelative(7.397f)
                verticalLineToRelative(10.54f)
                close()
            }
        }
        .build()
        return _bitwarden!!
    }

private var _bitwarden: ImageVector? = null
