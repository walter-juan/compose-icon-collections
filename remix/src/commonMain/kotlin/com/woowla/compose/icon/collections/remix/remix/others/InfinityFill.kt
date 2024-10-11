package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.InfinityFill: ImageVector
    get() {
        if (_infinityFill != null) {
            return _infinityFill!!
        }
        _infinityFill = Builder(name = "InfinityFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 13.933f, 4.567f, 15.5f, 6.5f, 15.5f)
                curveTo(7.703f, 15.5f, 8.52f, 15.066f, 9.199f, 14.387f)
                curveTo(9.821f, 13.764f, 10.321f, 12.947f, 10.855f, 12.0f)
                curveTo(10.321f, 11.053f, 9.821f, 10.236f, 9.199f, 9.613f)
                curveTo(8.52f, 8.934f, 7.703f, 8.5f, 6.5f, 8.5f)
                curveTo(4.567f, 8.5f, 3.0f, 10.067f, 3.0f, 12.0f)
                close()
                moveTo(6.5f, 17.5f)
                curveTo(3.462f, 17.5f, 1.0f, 15.038f, 1.0f, 12.0f)
                curveTo(1.0f, 8.962f, 3.462f, 6.5f, 6.5f, 6.5f)
                curveTo(8.297f, 6.5f, 9.605f, 7.191f, 10.613f, 8.199f)
                curveTo(11.149f, 8.734f, 11.6f, 9.362f, 12.0f, 10.002f)
                curveTo(12.4f, 9.362f, 12.851f, 8.734f, 13.387f, 8.199f)
                curveTo(14.395f, 7.191f, 15.703f, 6.5f, 17.5f, 6.5f)
                curveTo(20.538f, 6.5f, 23.0f, 8.962f, 23.0f, 12.0f)
                curveTo(23.0f, 15.038f, 20.538f, 17.5f, 17.5f, 17.5f)
                curveTo(15.703f, 17.5f, 14.395f, 16.809f, 13.387f, 15.801f)
                curveTo(12.851f, 15.266f, 12.4f, 14.638f, 12.0f, 13.998f)
                curveTo(11.6f, 14.638f, 11.149f, 15.266f, 10.613f, 15.801f)
                curveTo(9.605f, 16.809f, 8.297f, 17.5f, 6.5f, 17.5f)
                close()
                moveTo(13.145f, 12.0f)
                curveTo(13.679f, 12.947f, 14.179f, 13.764f, 14.801f, 14.387f)
                curveTo(15.48f, 15.066f, 16.296f, 15.5f, 17.5f, 15.5f)
                curveTo(19.433f, 15.5f, 21.0f, 13.933f, 21.0f, 12.0f)
                curveTo(21.0f, 10.067f, 19.433f, 8.5f, 17.5f, 8.5f)
                curveTo(16.296f, 8.5f, 15.48f, 8.934f, 14.801f, 9.613f)
                curveTo(14.179f, 10.236f, 13.679f, 11.053f, 13.145f, 12.0f)
                close()
            }
        }
        .build()
        return _infinityFill!!
    }

private var _infinityFill: ImageVector? = null
