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

public val FilledGroup.Rosette: ImageVector
    get() {
        if (_rosette != null) {
            return _rosette!!
        }
        _rosette = Builder(name = "Rosette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 2.011f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 2.113f, 0.797f)
                lineToRelative(0.154f, 0.145f)
                lineToRelative(0.698f, 0.698f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.71f, 0.341f)
                lineToRelative(0.135f, 0.008f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 3.195f, 3.018f)
                lineToRelative(0.005f, 0.182f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.27f, 0.092f, 0.533f, 0.258f, 0.743f)
                lineToRelative(0.09f, 0.1f)
                lineToRelative(0.697f, 0.698f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 0.147f, 4.382f)
                lineToRelative(-0.145f, 0.154f)
                lineToRelative(-0.698f, 0.698f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.341f, 0.71f)
                lineToRelative(-0.008f, 0.135f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -3.018f, 3.195f)
                lineToRelative(-0.182f, 0.005f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.743f, 0.258f)
                lineToRelative(-0.1f, 0.09f)
                lineToRelative(-0.698f, 0.697f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -4.382f, 0.147f)
                lineToRelative(-0.154f, -0.145f)
                lineToRelative(-0.698f, -0.698f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.71f, -0.341f)
                lineToRelative(-0.135f, -0.008f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -3.195f, -3.018f)
                lineToRelative(-0.005f, -0.182f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.258f, -0.743f)
                lineToRelative(-0.09f, -0.1f)
                lineToRelative(-0.697f, -0.698f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -0.147f, -4.382f)
                lineToRelative(0.145f, -0.154f)
                lineToRelative(0.698f, -0.698f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.341f, -0.71f)
                lineToRelative(0.008f, -0.135f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.005f, -0.182f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 3.013f, -3.013f)
                lineToRelative(0.182f, -0.005f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.743f, -0.258f)
                lineToRelative(0.1f, -0.09f)
                lineToRelative(0.698f, -0.697f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 2.269f, -0.944f)
                close()
            }
        }
        .build()
        return _rosette!!
    }

private var _rosette: ImageVector? = null
