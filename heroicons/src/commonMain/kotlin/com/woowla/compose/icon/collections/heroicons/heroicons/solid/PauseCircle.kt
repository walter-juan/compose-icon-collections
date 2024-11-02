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

public val SolidGroup.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 6.615f, 6.615f, 2.25f, 12.0f, 2.25f)
                curveTo(17.385f, 2.25f, 21.75f, 6.615f, 21.75f, 12.0f)
                curveTo(21.75f, 17.385f, 17.385f, 21.75f, 12.0f, 21.75f)
                curveTo(6.615f, 21.75f, 2.25f, 17.385f, 2.25f, 12.0f)
                close()
                moveTo(9.0f, 8.25f)
                curveTo(8.586f, 8.25f, 8.25f, 8.586f, 8.25f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(8.25f, 15.414f, 8.586f, 15.75f, 9.0f, 15.75f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 15.75f, 10.5f, 15.414f, 10.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(10.5f, 8.586f, 10.164f, 8.25f, 9.75f, 8.25f)
                horizontalLineTo(9.0f)
                close()
                moveTo(14.25f, 8.25f)
                curveTo(13.836f, 8.25f, 13.5f, 8.586f, 13.5f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(13.5f, 15.414f, 13.836f, 15.75f, 14.25f, 15.75f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 15.75f, 15.75f, 15.414f, 15.75f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(15.75f, 8.586f, 15.414f, 8.25f, 15.0f, 8.25f)
                horizontalLineTo(14.25f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
