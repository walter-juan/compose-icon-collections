package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Cloudscale: ImageVector
    get() {
        if (_cloudscale != null) {
            return _cloudscale!!
        }
        _cloudscale = Builder(name = "Cloudscale", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.1f, 154.0f)
                lineToRelative(-9.4f, 7.6f)
                curveToRelative(-22.5f, -19.3f, -51.5f, -33.6f, -83.3f, -33.6f)
                curveToRelative(-71.6f, 0.0f, -129.4f, 60.8f, -129.4f, 132.3f)
                curveToRelative(0.0f, 6.6f, 0.4f, 13.1f, 1.4f, 19.4f)
                curveToRelative(-2.0f, -56.0f, 41.8f, -97.4f, 92.6f, -97.4f)
                curveToRelative(24.2f, 0.0f, 46.2f, 9.4f, 62.6f, 24.7f)
                lineToRelative(-25.2f, 20.4f)
                curveToRelative(-8.3f, -0.9f, -16.8f, 1.8f, -23.1f, 8.1f)
                curveToRelative(-11.1f, 11.0f, -11.1f, 28.9f, 0.0f, 40.0f)
                curveToRelative(11.1f, 11.0f, 28.9f, 11.0f, 40.0f, 0.0f)
                curveToRelative(6.3f, -6.3f, 9.0f, -14.9f, 8.1f, -23.1f)
                lineToRelative(75.2f, -88.8f)
                curveToRelative(6.3f, -6.5f, -3.3f, -15.9f, -9.5f, -9.6f)
                close()
                moveTo(213.7f, 246.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 20.6f, 19.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -20.6f, -19.0f)
                close()
                moveTo(224.0f, 32.0f)
                arcToRelative(224.0f, 224.0f, 0.0f, true, false, 0.0f, 448.0f)
                arcToRelative(224.0f, 224.0f, 0.0f, true, false, 0.0f, -448.0f)
                close()
                moveTo(224.0f, 96.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, 320.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, -320.0f)
                close()
            }
        }
        .build()
        return _cloudscale!!
    }

private var _cloudscale: ImageVector? = null
