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

public val Octicons.Accessibility24: ImageVector
    get() {
        if (_accessibility24 != null) {
            return _accessibility24!!
        }
        _accessibility24 = Builder(name = "Accessibility24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.974f, 8.114f)
                arcToRelative(3.573f, 3.573f, 0.0f, true, false, -3.947f, 0.0f)
                curveToRelative(-0.302f, 0.21f, -0.57f, 0.467f, -0.79f, 0.762f)
                lineTo(3.708f, 8.876f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.885f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, false, -0.026f, 0.188f)
                lineToRelative(-0.814f, 7.267f)
                lineToRelative(-0.499f, 4.142f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.49f, 0.18f)
                lineToRelative(0.42f, -3.486f)
                horizontalLineToRelative(5.67f)
                lineToRelative(0.42f, 3.485f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.49f, -0.18f)
                lineToRelative(-0.5f, -4.142f)
                lineToRelative(-0.813f, -7.266f)
                arcToRelative(3.502f, 3.502f, 0.0f, false, false, -0.026f, -0.188f)
                horizontalLineToRelative(4.885f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.527f)
                arcToRelative(3.466f, 3.466f, 0.0f, false, false, -0.79f, -0.762f)
                close()
                moveTo(14.073f, 5.135f)
                arcToRelative(2.073f, 2.073f, 0.0f, true, true, -4.146f, 0.0f)
                arcToRelative(2.073f, 2.073f, 0.0f, false, true, 4.146f, 0.0f)
                close()
                moveTo(13.942f, 10.731f)
                lineTo(14.662f, 17.167f)
                lineTo(9.338f, 17.167f)
                lineToRelative(0.72f, -6.436f)
                arcToRelative(1.954f, 1.954f, 0.0f, false, true, 3.884f, 0.0f)
                close()
            }
        }
        .build()
        return _accessibility24!!
    }

private var _accessibility24: ImageVector? = null
