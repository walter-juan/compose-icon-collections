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

public val SolidGroup.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) {
            return _arrowDownRight!!
        }
        _arrowDownRight = Builder(name = "ArrowDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.97f, 3.97f)
                curveTo(4.263f, 3.677f, 4.737f, 3.677f, 5.03f, 3.97f)
                lineTo(18.75f, 17.689f)
                verticalLineTo(8.25f)
                curveTo(18.75f, 7.836f, 19.086f, 7.5f, 19.5f, 7.5f)
                curveTo(19.914f, 7.5f, 20.25f, 7.836f, 20.25f, 8.25f)
                verticalLineTo(19.5f)
                curveTo(20.25f, 19.914f, 19.914f, 20.25f, 19.5f, 20.25f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 20.25f, 7.5f, 19.914f, 7.5f, 19.5f)
                curveTo(7.5f, 19.086f, 7.836f, 18.75f, 8.25f, 18.75f)
                horizontalLineTo(17.689f)
                lineTo(3.97f, 5.03f)
                curveTo(3.677f, 4.737f, 3.677f, 4.263f, 3.97f, 3.97f)
                close()
            }
        }
        .build()
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
