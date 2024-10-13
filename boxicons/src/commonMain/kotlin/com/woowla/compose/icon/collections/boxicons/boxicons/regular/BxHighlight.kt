package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxHighlight: ImageVector
    get() {
        if (_bxHighlight != null) {
            return _bxHighlight!!
        }
        _bxHighlight = Builder(name = "BxHighlight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.707f, 5.826f)
                lineToRelative(-3.535f, -3.533f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.408f, -0.006f)
                lineTo(7.096f, 10.82f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.273f, 0.488f)
                lineToRelative(-1.024f, 4.437f)
                lineTo(4.0f, 18.0f)
                horizontalLineToRelative(2.828f)
                lineToRelative(1.142f, -1.129f)
                lineToRelative(3.588f, -0.828f)
                curveToRelative(0.18f, -0.042f, 0.345f, -0.133f, 0.477f, -0.262f)
                lineToRelative(8.667f, -8.535f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.005f, -1.42f)
                close()
                moveTo(11.338f, 13.659f)
                lineTo(9.217f, 11.539f)
                lineTo(16.46f, 4.408f)
                lineTo(18.58f, 6.528f)
                lineTo(11.338f, 13.659f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bxHighlight!!
    }

private var _bxHighlight: ImageVector? = null
