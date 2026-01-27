package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.CheckboxFill24: ImageVector
    get() {
        if (_checkboxFill24 != null) {
            return _checkboxFill24!!
        }
        _checkboxFill24 = Builder(name = "CheckboxFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 2.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(3.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                lineTo(2.0f, 3.75f)
                curveTo(2.0f, 2.783f, 2.783f, 2.0f, 3.75f, 2.0f)
                close()
                moveTo(17.28f, 8.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-5.97f, 5.969f)
                lineToRelative(-2.47f, -2.469f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _checkboxFill24!!
    }

private var _checkboxFill24: ImageVector? = null
