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

public val Octicons.AlertFill16: ImageVector
    get() {
        if (_alertFill16 != null) {
            return _alertFill16!!
        }
        _alertFill16 = Builder(name = "AlertFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.457f, 1.047f)
                curveToRelative(0.659f, -1.234f, 2.427f, -1.234f, 3.086f, 0.0f)
                lineToRelative(6.082f, 11.378f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.082f, 15.0f)
                lineTo(1.918f, 15.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.543f, -2.575f)
                close()
                moveTo(8.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 5.0f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alertFill16!!
    }

private var _alertFill16: ImageVector? = null
