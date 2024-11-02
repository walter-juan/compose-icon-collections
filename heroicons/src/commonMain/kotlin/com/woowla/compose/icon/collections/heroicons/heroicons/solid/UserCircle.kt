package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.685f, 19.097f)
                curveTo(20.572f, 17.319f, 21.75f, 14.797f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 14.797f, 3.428f, 17.319f, 5.315f, 19.097f)
                curveTo(7.06f, 20.742f, 9.412f, 21.75f, 12.0f, 21.75f)
                curveTo(14.588f, 21.75f, 16.94f, 20.742f, 18.685f, 19.097f)
                close()
                moveTo(6.145f, 17.812f)
                curveTo(7.52f, 16.098f, 9.632f, 15.0f, 12.0f, 15.0f)
                curveTo(14.368f, 15.0f, 16.48f, 16.098f, 17.855f, 17.812f)
                curveTo(16.36f, 19.318f, 14.289f, 20.25f, 12.0f, 20.25f)
                curveTo(9.711f, 20.25f, 7.64f, 19.318f, 6.145f, 17.812f)
                close()
                moveTo(15.75f, 9.0f)
                curveTo(15.75f, 11.071f, 14.071f, 12.75f, 12.0f, 12.75f)
                curveTo(9.929f, 12.75f, 8.25f, 11.071f, 8.25f, 9.0f)
                curveTo(8.25f, 6.929f, 9.929f, 5.25f, 12.0f, 5.25f)
                curveTo(14.071f, 5.25f, 15.75f, 6.929f, 15.75f, 9.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
