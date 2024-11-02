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

public val SolidGroup.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) {
            return _lockClosed!!
        }
        _lockClosed = Builder(name = "LockClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.5f)
                curveTo(9.101f, 1.5f, 6.75f, 3.851f, 6.75f, 6.75f)
                verticalLineTo(9.75f)
                curveTo(5.093f, 9.75f, 3.75f, 11.093f, 3.75f, 12.75f)
                verticalLineTo(19.5f)
                curveTo(3.75f, 21.157f, 5.093f, 22.5f, 6.75f, 22.5f)
                horizontalLineTo(17.25f)
                curveTo(18.907f, 22.5f, 20.25f, 21.157f, 20.25f, 19.5f)
                verticalLineTo(12.75f)
                curveTo(20.25f, 11.093f, 18.907f, 9.75f, 17.25f, 9.75f)
                verticalLineTo(6.75f)
                curveTo(17.25f, 3.851f, 14.899f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(15.75f, 9.75f)
                verticalLineTo(6.75f)
                curveTo(15.75f, 4.679f, 14.071f, 3.0f, 12.0f, 3.0f)
                curveTo(9.929f, 3.0f, 8.25f, 4.679f, 8.25f, 6.75f)
                verticalLineTo(9.75f)
                horizontalLineTo(15.75f)
                close()
            }
        }
        .build()
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
