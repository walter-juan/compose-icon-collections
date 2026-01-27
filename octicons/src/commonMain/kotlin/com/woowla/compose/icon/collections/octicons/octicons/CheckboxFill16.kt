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

public val Octicons.CheckboxFill16: ImageVector
    get() {
        if (_checkboxFill16 != null) {
            return _checkboxFill16!!
        }
        _checkboxFill16 = Builder(name = "CheckboxFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 1.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 15.0f)
                lineTo(2.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 13.25f)
                lineTo(1.0f, 2.75f)
                curveTo(1.0f, 1.783f, 1.783f, 1.0f, 2.75f, 1.0f)
                close()
                moveTo(11.78f, 6.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(6.75f, 9.189f)
                lineTo(5.28f, 7.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _checkboxFill16!!
    }

private var _checkboxFill16: ImageVector? = null
