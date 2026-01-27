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

public val BrandsGroup.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.7f, 268.1f)
                lineToRelative(76.2f, 0.0f)
                lineToRelative(-38.1f, -91.6f)
                lineToRelative(-38.1f, 91.6f)
                close()
                moveTo(223.8f, 32.0f)
                lineTo(16.0f, 106.4f)
                lineTo(47.8f, 382.1f)
                lineTo(223.8f, 480.0f)
                lineTo(399.8f, 382.1f)
                lineTo(431.6f, 106.4f)
                lineTo(223.8f, 32.0f)
                close()
                moveTo(354.0f, 373.8f)
                lineToRelative(-48.6f, 0.0f)
                lineToRelative(-26.2f, -65.4f)
                lineToRelative(-110.6f, 0.0f)
                lineToRelative(-26.2f, 65.4f)
                lineToRelative(-48.7f, 0.0f)
                lineToRelative(130.1f, -292.3f)
                lineToRelative(130.2f, 292.3f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
