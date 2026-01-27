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

public val BrandsGroup.CreativeCommonsShare: ImageVector
    get() {
        if (_creativeCommonsShare != null) {
            return _creativeCommonsShare!!
        }
        _creativeCommonsShare = Builder(name = "CreativeCommonsShare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(357.4f, 185.1f)
                curveToRelative(7.8f, 0.0f, 13.7f, 6.1f, 13.7f, 13.7f)
                lineToRelative(0.0f, 182.5f)
                curveToRelative(0.0f, 7.7f, -6.1f, 13.7f, -13.7f, 13.7f)
                lineToRelative(-135.1f, 0.0f)
                curveToRelative(-7.7f, 0.0f, -13.7f, -6.0f, -13.7f, -13.7f)
                lineToRelative(0.0f, -54.0f)
                lineToRelative(-54.0f, 0.0f)
                curveToRelative(-7.8f, 0.0f, -13.7f, -6.0f, -13.7f, -13.7f)
                lineToRelative(0.0f, -182.5f)
                curveToRelative(0.0f, -8.2f, 6.6f, -12.7f, 12.4f, -13.7f)
                lineToRelative(136.4f, 0.0f)
                curveToRelative(7.7f, 0.0f, 13.7f, 6.0f, 13.7f, 13.7f)
                lineToRelative(0.0f, 54.0f)
                lineToRelative(54.0f, 0.0f)
                close()
                moveTo(167.9f, 300.3f)
                lineToRelative(40.7f, 0.0f)
                lineToRelative(0.0f, -101.4f)
                curveToRelative(0.0f, -7.4f, 5.8f, -12.6f, 12.0f, -13.7f)
                lineToRelative(55.8f, 0.0f)
                lineToRelative(0.0f, -40.3f)
                lineToRelative(-108.5f, 0.0f)
                lineToRelative(0.0f, 155.4f)
                close()
                moveTo(344.1f, 212.2f)
                lineToRelative(-108.5f, 0.0f)
                lineToRelative(0.0f, 155.4f)
                lineToRelative(108.5f, 0.0f)
                lineToRelative(0.0f, -155.4f)
                close()
            }
        }
        .build()
        return _creativeCommonsShare!!
    }

private var _creativeCommonsShare: ImageVector? = null
