package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsColor: ImageVector
    get() {
        if (_bxsColor != null) {
            return _bxsColor!!
        }
        _bxsColor = Builder(name = "BxsColor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.08f, 11.25f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 8.0f, 9.05f)
                lineTo(4.43f, 5.49f)
                arcTo(9.88f, 9.88f, 0.0f, false, false, 2.0f, 11.25f)
                close()
                moveTo(9.05f, 8.0f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, 2.2f, -0.91f)
                lineTo(11.25f, 2.0f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, -5.76f, 2.43f)
                close()
                moveTo(12.75f, 2.0f)
                verticalLineToRelative(5.0f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 15.0f, 8.0f)
                lineToRelative(3.56f, -3.56f)
                arcTo(9.88f, 9.88f, 0.0f, false, false, 12.75f, 2.0f)
                close()
                moveTo(8.0f, 15.0f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -0.91f, -2.2f)
                lineTo(2.0f, 12.8f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, 2.39f, 5.76f)
                close()
                moveTo(11.25f, 16.92f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -2.2f, -0.92f)
                lineToRelative(-3.56f, 3.57f)
                arcTo(9.88f, 9.88f, 0.0f, false, false, 11.25f, 22.0f)
                close()
                moveTo(16.0f, 9.05f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, 0.91f, 2.2f)
                horizontalLineToRelative(5.0f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, -2.39f, -5.76f)
                close()
                moveTo(15.0f, 16.0f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -2.2f, 0.91f)
                verticalLineToRelative(5.0f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, 5.76f, -2.39f)
                close()
                moveTo(16.92f, 12.75f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 16.0f, 15.0f)
                lineToRelative(3.56f, 3.56f)
                arcTo(9.88f, 9.88f, 0.0f, false, false, 22.0f, 12.75f)
                close()
            }
        }
        .build()
        return _bxsColor!!
    }

private var _bxsColor: ImageVector? = null
