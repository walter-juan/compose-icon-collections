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

public val SolidGroup.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) {
            return _arrowDownLeft!!
        }
        _arrowDownLeft = Builder(name = "ArrowDownLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.03f, 3.97f)
                curveTo(20.323f, 4.263f, 20.323f, 4.737f, 20.03f, 5.03f)
                lineTo(6.311f, 18.75f)
                lineTo(15.75f, 18.75f)
                curveTo(16.164f, 18.75f, 16.5f, 19.086f, 16.5f, 19.5f)
                curveTo(16.5f, 19.914f, 16.164f, 20.25f, 15.75f, 20.25f)
                lineTo(4.5f, 20.25f)
                curveTo(4.086f, 20.25f, 3.75f, 19.914f, 3.75f, 19.5f)
                lineTo(3.75f, 8.25f)
                curveTo(3.75f, 7.836f, 4.086f, 7.5f, 4.5f, 7.5f)
                curveTo(4.914f, 7.5f, 5.25f, 7.836f, 5.25f, 8.25f)
                lineTo(5.25f, 17.689f)
                lineTo(18.97f, 3.97f)
                curveTo(19.263f, 3.677f, 19.737f, 3.677f, 20.03f, 3.97f)
                close()
            }
        }
        .build()
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
