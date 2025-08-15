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

public val BrandsGroup.CreativeCommonsBy: ImageVector
    get() {
        if (_creativeCommonsBy != null) {
            return _creativeCommonsBy!!
        }
        _creativeCommonsBy = Builder(name = "CreativeCommonsBy", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(322.9f, 194.4f)
                lineToRelative(0.0f, 101.4f)
                lineToRelative(-28.3f, 0.0f)
                lineToRelative(0.0f, 120.5f)
                lineToRelative(-77.1f, 0.0f)
                lineToRelative(0.0f, -120.4f)
                lineToRelative(-28.3f, 0.0f)
                lineToRelative(0.0f, -101.5f)
                curveToRelative(0.0f, -4.4f, 1.6f, -8.2f, 4.6f, -11.3f)
                curveToRelative(3.1f, -3.1f, 6.9f, -4.7f, 11.3f, -4.7f)
                lineToRelative(101.9f, 0.0f)
                curveToRelative(4.1f, 0.0f, 7.8f, 1.6f, 11.1f, 4.7f)
                curveToRelative(3.1f, 3.2f, 4.8f, 6.9f, 4.8f, 11.3f)
                close()
                moveTo(290.4f, 129.9f)
                arcToRelative(34.5f, 34.5f, 0.0f, true, true, -69.0f, 0.8f)
                arcToRelative(34.5f, 34.5f, 0.0f, true, true, 69.0f, -0.8f)
                close()
                moveTo(255.6f, 8.0f)
                curveTo(397.4f, 8.0f, 504.0f, 118.1f, 504.0f, 256.0f)
                curveTo(504.0f, 403.1f, 385.5f, 504.0f, 255.6f, 504.0f)
                curveTo(121.6f, 504.0f, 8.0f, 394.5f, 8.0f, 256.0f)
                curveTo(8.0f, 123.1f, 112.7f, 8.0f, 255.6f, 8.0f)
                close()
                moveTo(256.4f, 52.7f)
                curveToRelative(-118.2f, 0.0f, -203.7f, 97.9f, -203.7f, 203.3f)
                curveToRelative(0.0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0.0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
            }
        }
        .build()
        return _creativeCommonsBy!!
    }

private var _creativeCommonsBy: ImageVector? = null
