package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxFontColor: ImageVector
    get() {
        if (_bxFontColor != null) {
            return _bxFontColor!!
        }
        _bxFontColor = Builder(name = "BxFontColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(12.5f, 4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.401f, 0.0f, -0.764f, 0.24f, -0.921f, 0.609f)
                lineTo(5.745f, 16.0f)
                horizontalLineToRelative(2.173f)
                lineToRelative(1.273f, -3.0f)
                horizontalLineToRelative(5.604f)
                lineToRelative(1.268f, 3.0f)
                horizontalLineToRelative(2.171f)
                lineTo(13.421f, 4.61f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.5f, 4.0f)
                close()
                moveTo(10.04f, 11.0f)
                lineTo(11.999f, 6.384f)
                lineTo(13.95f, 11.0f)
                horizontalLineToRelative(-3.91f)
                close()
            }
        }
        .build()
        return _bxFontColor!!
    }

private var _bxFontColor: ImageVector? = null
