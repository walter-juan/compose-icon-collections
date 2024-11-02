package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.CheckBadge: ImageVector
    get() {
        if (_checkBadge != null) {
            return _checkBadge!!
        }
        _checkBadge = Builder(name = "CheckBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.75f)
                lineTo(11.25f, 15.0f)
                lineTo(15.0f, 9.75f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 13.268f, 20.37f, 14.389f, 19.407f, 15.068f)
                curveTo(19.608f, 16.229f, 19.26f, 17.467f, 18.364f, 18.364f)
                curveTo(17.467f, 19.261f, 16.229f, 19.608f, 15.068f, 19.407f)
                curveTo(14.389f, 20.371f, 13.268f, 21.0f, 12.0f, 21.0f)
                curveTo(10.732f, 21.0f, 9.611f, 20.371f, 8.932f, 19.407f)
                curveTo(7.771f, 19.609f, 6.533f, 19.261f, 5.636f, 18.364f)
                curveTo(4.739f, 17.467f, 4.391f, 16.229f, 4.593f, 15.068f)
                curveTo(3.629f, 14.389f, 3.0f, 13.268f, 3.0f, 12.0f)
                curveTo(3.0f, 10.732f, 3.629f, 9.611f, 4.593f, 8.932f)
                curveTo(4.391f, 7.771f, 4.739f, 6.533f, 5.636f, 5.636f)
                curveTo(6.533f, 4.739f, 7.771f, 4.392f, 8.932f, 4.593f)
                curveTo(9.611f, 3.63f, 10.732f, 3.0f, 12.0f, 3.0f)
                curveTo(13.268f, 3.0f, 14.389f, 3.629f, 15.068f, 4.593f)
                curveTo(16.229f, 4.391f, 17.467f, 4.739f, 18.364f, 5.636f)
                curveTo(19.261f, 6.533f, 19.609f, 7.771f, 19.407f, 8.932f)
                curveTo(20.371f, 9.611f, 21.0f, 10.732f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _checkBadge!!
    }

private var _checkBadge: ImageVector? = null
