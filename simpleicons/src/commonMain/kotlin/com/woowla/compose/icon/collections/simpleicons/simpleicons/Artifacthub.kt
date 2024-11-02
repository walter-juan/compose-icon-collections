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

public val Simpleicons.Artifacthub: ImageVector
    get() {
        if (_artifacthub != null) {
            return _artifacthub!!
        }
        _artifacthub = Builder(name = "Artifacthub", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.617f, 0.001f, -1.242f, -0.172f, -1.78f, -0.5f)
                lineToRelative(-7.51f, -4.293f)
                curveToRelative(-1.018f, -0.617f, -1.64f, -1.718f, -1.641f, -2.908f)
                lineTo(1.069f, 7.73f)
                curveToRelative(0.0f, -1.253f, 0.637f, -2.369f, 1.76f, -3.01f)
                lineTo(10.25f, 0.479f)
                curveToRelative(1.08f, -0.639f, 2.415f, -0.638f, 3.495f, 0.001f)
                lineToRelative(7.42f, 4.238f)
                curveToRelative(1.08f, 0.596f, 1.771f, 1.734f, 1.763f, 3.01f)
                verticalLineToRelative(8.582f)
                curveToRelative(0.0f, 0.968f, -0.443f, 2.164f, -1.637f, 2.899f)
                lineToRelative(-7.511f, 4.292f)
                curveToRelative(-0.563f, 0.344f, -1.199f, 0.5f, -1.782f, 0.5f)
                close()
                moveTo(11.5f, 2.653f)
                lineTo(3.955f, 6.962f)
                curveToRelative(-0.201f, 0.157f, -0.379f, 0.369f, -0.379f, 0.767f)
                lineToRelative(0.001f, 8.67f)
                curveToRelative(0.038f, 0.22f, 0.119f, 0.428f, 0.373f, 0.635f)
                lineToRelative(7.56f, 4.317f)
                curveToRelative(0.266f, 0.172f, 0.664f, 0.21f, 0.985f, 0.0f)
                lineToRelative(7.518f, -4.297f)
                curveToRelative(0.232f, -0.148f, 0.371f, -0.389f, 0.41f, -0.654f)
                lineTo(20.423f, 7.73f)
                curveToRelative(0.009f, -0.299f, -0.136f, -0.589f, -0.377f, -0.765f)
                lineTo(12.5f, 2.652f)
                curveToRelative(-0.391f, -0.239f, -0.759f, -0.156f, -1.0f, 0.001f)
                close()
            }
        }
        .build()
        return _artifacthub!!
    }

private var _artifacthub: ImageVector? = null
