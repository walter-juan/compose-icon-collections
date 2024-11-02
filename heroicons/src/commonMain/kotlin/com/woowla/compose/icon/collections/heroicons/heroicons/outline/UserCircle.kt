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

public val OutlineGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.982f, 18.725f)
                curveTo(16.612f, 16.917f, 14.442f, 15.75f, 12.0f, 15.75f)
                curveTo(9.558f, 15.75f, 7.388f, 16.917f, 6.018f, 18.725f)
                moveTo(17.982f, 18.725f)
                curveTo(19.833f, 17.076f, 21.0f, 14.674f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                curveTo(3.0f, 14.674f, 4.167f, 17.076f, 6.018f, 18.725f)
                moveTo(17.982f, 18.725f)
                curveTo(16.392f, 20.14f, 14.296f, 21.0f, 12.0f, 21.0f)
                curveTo(9.704f, 21.0f, 7.609f, 20.14f, 6.018f, 18.725f)
                moveTo(15.0f, 9.75f)
                curveTo(15.0f, 11.407f, 13.657f, 12.75f, 12.0f, 12.75f)
                curveTo(10.343f, 12.75f, 9.0f, 11.407f, 9.0f, 9.75f)
                curveTo(9.0f, 8.093f, 10.343f, 6.75f, 12.0f, 6.75f)
                curveTo(13.657f, 6.75f, 15.0f, 8.093f, 15.0f, 9.75f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
