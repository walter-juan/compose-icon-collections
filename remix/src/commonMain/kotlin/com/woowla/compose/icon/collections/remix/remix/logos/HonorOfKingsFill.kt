package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.HonorOfKingsFill: ImageVector
    get() {
        if (_honorOfKingsFill != null) {
            return _honorOfKingsFill!!
        }
        _honorOfKingsFill = Builder(name = "HonorOfKingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.159f, 4.258f)
                curveTo(21.193f, 7.757f, 21.75f, 9.069f, 21.947f, 10.959f)
                curveTo(22.248f, 13.853f, 21.29f, 16.853f, 19.072f, 19.071f)
                curveTo(15.406f, 22.737f, 9.601f, 22.962f, 5.673f, 19.744f)
                lineTo(8.524f, 16.891f)
                curveTo(10.868f, 18.561f, 14.142f, 18.345f, 16.244f, 16.243f)
                curveTo(18.346f, 14.14f, 18.562f, 10.866f, 16.892f, 8.523f)
                lineTo(21.159f, 4.258f)
                close()
                moveTo(18.329f, 4.256f)
                lineTo(15.478f, 7.109f)
                curveTo(13.134f, 5.439f, 9.86f, 5.655f, 7.758f, 7.757f)
                curveTo(5.656f, 9.859f, 5.44f, 13.133f, 7.11f, 15.477f)
                lineTo(2.843f, 19.742f)
                curveTo(2.809f, 16.243f, 2.252f, 14.931f, 2.055f, 13.041f)
                curveTo(1.754f, 10.147f, 2.712f, 7.147f, 4.93f, 4.929f)
                curveTo(8.596f, 1.263f, 14.401f, 1.038f, 18.329f, 4.256f)
                close()
                moveTo(12.001f, 8.0f)
                curveTo(14.21f, 8.0f, 16.001f, 9.791f, 16.001f, 12.0f)
                curveTo(16.001f, 14.209f, 14.21f, 16.0f, 12.001f, 16.0f)
                curveTo(9.792f, 16.0f, 8.001f, 14.209f, 8.001f, 12.0f)
                curveTo(8.001f, 9.791f, 9.792f, 8.0f, 12.001f, 8.0f)
                close()
                moveTo(12.001f, 10.5f)
                curveTo(11.172f, 10.5f, 10.501f, 11.172f, 10.501f, 12.0f)
                curveTo(10.501f, 12.828f, 11.172f, 13.5f, 12.001f, 13.5f)
                curveTo(12.829f, 13.5f, 13.501f, 12.828f, 13.501f, 12.0f)
                curveTo(13.501f, 11.172f, 12.829f, 10.5f, 12.001f, 10.5f)
                close()
            }
        }
        .build()
        return _honorOfKingsFill!!
    }

private var _honorOfKingsFill: ImageVector? = null
