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

public val OthersGroup.AccessibilityFill: ImageVector
    get() {
        if (_accessibilityFill != null) {
            return _accessibilityFill!!
        }
        _accessibilityFill = Builder(name = "AccessibilityFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.5f, 7.0f)
                curveTo(13.5f, 7.828f, 12.828f, 8.5f, 12.0f, 8.5f)
                curveTo(11.172f, 8.5f, 10.5f, 7.828f, 10.5f, 7.0f)
                curveTo(10.5f, 6.172f, 11.172f, 5.5f, 12.0f, 5.5f)
                curveTo(12.828f, 5.5f, 13.5f, 6.172f, 13.5f, 7.0f)
                close()
                moveTo(6.629f, 10.429f)
                lineTo(7.371f, 8.571f)
                curveTo(8.822f, 9.143f, 10.443f, 9.5f, 12.0f, 9.5f)
                curveTo(13.559f, 9.5f, 15.173f, 9.139f, 16.626f, 8.572f)
                curveTo(16.629f, 8.571f, 17.384f, 10.423f, 17.359f, 10.433f)
                curveTo(16.282f, 10.853f, 15.141f, 11.147f, 14.0f, 11.33f)
                curveTo(14.0f, 12.2f, 13.915f, 13.094f, 14.317f, 13.897f)
                lineTo(15.894f, 17.053f)
                lineTo(14.106f, 17.947f)
                lineTo(12.553f, 14.842f)
                curveTo(12.448f, 14.632f, 12.234f, 14.5f, 12.0f, 14.5f)
                curveTo(11.766f, 14.5f, 11.552f, 14.632f, 11.447f, 14.842f)
                lineTo(9.894f, 17.947f)
                lineTo(8.105f, 17.053f)
                lineTo(9.683f, 13.897f)
                curveTo(10.085f, 13.094f, 10.0f, 12.2f, 10.0f, 11.33f)
                curveTo(8.857f, 11.147f, 7.705f, 10.858f, 6.629f, 10.429f)
                close()
            }
        }
        .build()
        return _accessibilityFill!!
    }

private var _accessibilityFill: ImageVector? = null
