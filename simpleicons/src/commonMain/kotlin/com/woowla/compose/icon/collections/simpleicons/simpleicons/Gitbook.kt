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

public val Simpleicons.Gitbook: ImageVector
    get() {
        if (_gitbook != null) {
            return _gitbook!!
        }
        _gitbook = Builder(name = "Gitbook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.513f, 1.097f)
                curveToRelative(-0.645f, 0.0f, -1.233f, 0.34f, -2.407f, 1.017f)
                lineTo(3.675f, 5.82f)
                arcTo(7.233f, 7.233f, 0.0f, false, false, 0.0f, 12.063f)
                verticalLineToRelative(0.236f)
                arcToRelative(7.233f, 7.233f, 0.0f, false, false, 3.667f, 6.238f)
                lineTo(7.69f, 20.86f)
                curveToRelative(2.354f, 1.36f, 3.531f, 2.042f, 4.824f, 2.042f)
                curveToRelative(1.292f, 0.001f, 2.47f, -0.678f, 4.825f, -2.038f)
                lineToRelative(4.251f, -2.453f)
                curveToRelative(1.177f, -0.68f, 1.764f, -1.02f, 2.087f, -1.579f)
                curveToRelative(0.323f, -0.56f, 0.324f, -1.24f, 0.323f, -2.6f)
                verticalLineToRelative(-2.63f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -1.558f, -0.903f)
                lineToRelative(-8.728f, 5.024f)
                curveToRelative(-0.587f, 0.337f, -0.88f, 0.507f, -1.201f, 0.507f)
                curveToRelative(-0.323f, 0.0f, -0.616f, -0.168f, -1.204f, -0.506f)
                lineToRelative(-5.904f, -3.393f)
                curveToRelative(-0.297f, -0.171f, -0.446f, -0.256f, -0.565f, -0.271f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.634f, 0.368f)
                curveToRelative(-0.045f, 0.111f, -0.045f, 0.282f, -0.043f, 0.625f)
                curveToRelative(0.002f, 0.252f, 0.0f, 0.378f, 0.025f, 0.494f)
                curveToRelative(0.053f, 0.259f, 0.189f, 0.493f, 0.387f, 0.667f)
                curveToRelative(0.089f, 0.077f, 0.198f, 0.14f, 0.416f, 0.266f)
                lineToRelative(6.315f, 3.65f)
                curveToRelative(0.589f, 0.34f, 0.884f, 0.51f, 1.207f, 0.51f)
                curveToRelative(0.324f, 0.0f, 0.617f, -0.17f, 1.206f, -0.509f)
                lineToRelative(7.74f, -4.469f)
                curveToRelative(0.202f, -0.116f, 0.302f, -0.172f, 0.377f, -0.13f)
                curveToRelative(0.075f, 0.044f, 0.075f, 0.16f, 0.075f, 0.392f)
                verticalLineToRelative(1.193f)
                curveToRelative(0.0f, 0.34f, 0.001f, 0.51f, -0.08f, 0.649f)
                curveToRelative(-0.08f, 0.14f, -0.227f, 0.224f, -0.522f, 0.394f)
                lineToRelative(-6.382f, 3.685f)
                curveToRelative(-1.178f, 0.68f, -1.767f, 1.02f, -2.413f, 1.02f)
                curveToRelative(-0.646f, 0.0f, -1.236f, -0.34f, -2.412f, -1.022f)
                lineToRelative(-5.97f, -3.452f)
                lineToRelative(-0.043f, -0.025f)
                arcToRelative(4.106f, 4.106f, 0.0f, false, true, -2.031f, -3.52f)
                verticalLineTo(11.7f)
                curveToRelative(0.0f, -0.801f, 0.427f, -1.541f, 1.12f, -1.944f)
                arcToRelative(1.979f, 1.979f, 0.0f, false, true, 1.982f, -0.001f)
                lineToRelative(4.946f, 2.858f)
                curveToRelative(1.174f, 0.679f, 1.762f, 1.019f, 2.407f, 1.02f)
                curveToRelative(0.645f, 0.0f, 1.233f, -0.34f, 2.41f, -1.017f)
                lineToRelative(7.482f, -4.306f)
                arcToRelative(1.091f, 1.091f, 0.0f, false, false, 0.0f, -1.891f)
                lineTo(14.92f, 2.11f)
                curveToRelative(-1.175f, -0.675f, -1.762f, -1.013f, -2.406f, -1.013f)
                close()
            }
        }
        .build()
        return _gitbook!!
    }

private var _gitbook: ImageVector? = null
