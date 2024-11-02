package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = Builder(name = "LockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.5f)
                curveTo(20.899f, 1.5f, 23.25f, 3.851f, 23.25f, 6.75f)
                verticalLineTo(10.5f)
                curveTo(23.25f, 10.914f, 22.914f, 11.25f, 22.5f, 11.25f)
                curveTo(22.086f, 11.25f, 21.75f, 10.914f, 21.75f, 10.5f)
                verticalLineTo(6.75f)
                curveTo(21.75f, 4.679f, 20.071f, 3.0f, 18.0f, 3.0f)
                curveTo(15.929f, 3.0f, 14.25f, 4.679f, 14.25f, 6.75f)
                verticalLineTo(9.75f)
                curveTo(15.907f, 9.75f, 17.25f, 11.093f, 17.25f, 12.75f)
                verticalLineTo(19.5f)
                curveTo(17.25f, 21.157f, 15.907f, 22.5f, 14.25f, 22.5f)
                horizontalLineTo(3.75f)
                curveTo(2.093f, 22.5f, 0.75f, 21.157f, 0.75f, 19.5f)
                verticalLineTo(12.75f)
                curveTo(0.75f, 11.093f, 2.093f, 9.75f, 3.75f, 9.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.75f)
                curveTo(12.75f, 3.851f, 15.101f, 1.5f, 18.0f, 1.5f)
                close()
            }
        }
        .build()
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
