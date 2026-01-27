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

public val BrandsGroup.Dashcube: ImageVector
    get() {
        if (_dashcube != null) {
            return _dashcube!!
        }
        _dashcube = Builder(name = "Dashcube", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.9f, 104.0f)
                lineToRelative(-216.2f, 0.0f)
                curveToRelative(-51.1f, 0.0f, -91.2f, 43.3f, -91.2f, 93.5f)
                lineToRelative(0.0f, 229.5f)
                curveToRelative(0.0f, 50.5f, 40.1f, 85.0f, 91.2f, 85.0f)
                lineToRelative(227.2f, 0.0f)
                curveToRelative(51.1f, 0.0f, 91.2f, -34.5f, 91.2f, -85.0f)
                lineToRelative(0.0f, -427.0f)
                lineToRelative(-102.2f, 104.0f)
                close()
                moveTo(154.2f, 416.5f)
                curveToRelative(-17.7f, 0.0f, -32.4f, -15.1f, -32.4f, -32.8f)
                lineToRelative(0.0f, -142.9f)
                curveToRelative(0.0f, -17.7f, 14.7f, -32.5f, 32.4f, -32.5f)
                lineToRelative(140.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.8f, 32.0f, 32.5f)
                lineToRelative(0.0f, 123.5f)
                lineToRelative(51.1f, 52.3f)
                lineToRelative(-223.8f, 0.0f)
                lineToRelative(0.0f, -0.1f)
                close()
            }
        }
        .build()
        return _dashcube!!
    }

private var _dashcube: ImageVector? = null
