package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Copyleft: ImageVector
    get() {
        if (_copyleft != null) {
            return _copyleft!!
        }
        _copyleft = Builder(name = "Copyleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(14.883f, 9.229f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, -5.543f, -0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 1.502f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, 2.783f, 0.116f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.0f, 2.766f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, -2.783f, 0.116f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.501f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, 5.543f, -0.23f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.0f, -5.542f)
                close()
            }
        }
        .build()
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
