package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 6.0f)
                curveTo(15.75f, 8.071f, 14.071f, 9.75f, 12.0f, 9.75f)
                curveTo(9.929f, 9.75f, 8.25f, 8.071f, 8.25f, 6.0f)
                curveTo(8.25f, 3.929f, 9.929f, 2.25f, 12.0f, 2.25f)
                curveTo(14.071f, 2.25f, 15.75f, 3.929f, 15.75f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.501f, 20.118f)
                curveTo(4.571f, 16.037f, 7.902f, 12.75f, 12.0f, 12.75f)
                curveTo(16.098f, 12.75f, 19.429f, 16.037f, 19.499f, 20.118f)
                curveTo(17.216f, 21.166f, 14.676f, 21.75f, 12.0f, 21.75f)
                curveTo(9.324f, 21.75f, 6.784f, 21.166f, 4.501f, 20.118f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
