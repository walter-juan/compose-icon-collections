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

public val FilledGroup.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) {
            return _ghost3!!
        }
        _ghost3 = Builder(name = "Ghost3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(6.954f)
                lineToRelative(0.009f, 0.103f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -1.468f, 2.618f)
                lineToRelative(-0.163f, 0.08f)
                curveToRelative(-1.111f, 0.502f, -2.42f, 0.22f, -3.266f, -0.74f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -1.024f, 0.0f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, true, -4.176f, 0.0f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.512f, -0.249f)
                curveToRelative(-0.2f, 0.0f, -0.389f, 0.092f, -0.55f, 0.296f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -4.859f, -2.005f)
                lineToRelative(0.01f, -0.104f)
                lineToRelative(0.007f, -0.077f)
                lineToRelative(-0.008f, 0.074f)
                verticalLineToRelative(-6.95f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.747f, -7.746f)
                close()
                moveTo(10.01f, 9.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
