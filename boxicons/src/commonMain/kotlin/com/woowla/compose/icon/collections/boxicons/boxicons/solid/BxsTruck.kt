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

public val SolidGroup.BxsTruck: ImageVector
    get() {
        if (_bxsTruck != null) {
            return _bxsTruck!!
        }
        _bxsTruck = Builder(name = "BxsTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.15f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.72f, -1.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 1.73f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 7.0f, 0.27f)
                horizontalLineToRelative(3.1f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 6.9f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -0.14f, -0.52f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(2.43f)
                lineToRelative(1.8f, 3.0f)
                lineTo(15.0f, 12.0f)
                close()
                moveTo(6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 19.0f)
                close()
                moveTo(16.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bxsTruck!!
    }

private var _bxsTruck: ImageVector? = null
