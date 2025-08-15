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

public val BrandsGroup.TencentWeibo: ImageVector
    get() {
        if (_tencentWeibo != null) {
            return _tencentWeibo!!
        }
        _tencentWeibo = Builder(name = "TencentWeibo", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.5f, 495.8f)
                curveToRelative(1.4f, 19.9f, -27.6f, 22.2f, -29.7f, 2.9f)
                curveToRelative(-11.6f, -129.9f, 31.1f, -239.5f, 101.4f, -313.2f)
                curveToRelative(-15.6f, -34.0f, 9.2f, -77.1f, 50.6f, -77.1f)
                curveToRelative(30.3f, 0.0f, 55.1f, 24.6f, 55.1f, 55.1f)
                curveToRelative(0.0f, 44.0f, -49.5f, 70.8f, -86.9f, 45.1f)
                curveToRelative(-65.7f, 71.3f, -101.4f, 169.8f, -90.5f, 287.2f)
                close()
                moveTo(160.2f, 0.1f)
                curveToRelative(-125.9f, 0.0f, -204.3f, 134.2f, -148.3f, 242.3f)
                curveToRelative(8.7f, 17.4f, 35.3f, 4.5f, 26.3f, -13.4f)
                curveToRelative(-46.3f, -92.6f, 21.0f, -199.2f, 122.0f, -199.2f)
                curveToRelative(75.4f, 0.0f, 136.9f, 61.4f, 136.9f, 136.9f)
                curveToRelative(0.0f, 90.8f, -86.9f, 153.9f, -167.7f, 133.1f)
                curveToRelative(-19.1f, -4.1f, -25.6f, 24.4f, -6.6f, 29.1f)
                curveToRelative(110.7f, 23.2f, 204.0f, -60.0f, 204.0f, -162.3f)
                curveToRelative(0.0f, -91.9f, -74.6f, -166.5f, -166.6f, -166.5f)
                close()
            }
        }
        .build()
        return _tencentWeibo!!
    }

private var _tencentWeibo: ImageVector? = null
