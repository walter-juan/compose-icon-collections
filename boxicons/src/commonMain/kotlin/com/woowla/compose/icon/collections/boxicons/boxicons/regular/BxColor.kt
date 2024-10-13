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

public val RegularGroup.BxColor: ImageVector
    get() {
        if (_bxColor != null) {
            return _bxColor!!
        }
        _bxColor = Builder(name = "BxColor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
                moveTo(14.75f, 7.83f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.0f, 7.1f)
                verticalLineToRelative(-3.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 3.9f, 1.62f)
                close()
                moveTo(11.0f, 7.1f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.75f, 0.73f)
                lineTo(7.1f, 5.69f)
                arcTo(7.94f, 7.94f, 0.0f, false, true, 11.0f, 4.07f)
                close()
                moveTo(7.83f, 9.25f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.1f, 11.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 1.59f, -3.9f)
                close()
                moveTo(7.1f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.73f, 1.75f)
                lineTo(5.69f, 16.9f)
                arcTo(7.94f, 7.94f, 0.0f, false, true, 4.07f, 13.0f)
                close()
                moveTo(9.25f, 16.17f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.75f, 0.73f)
                verticalLineToRelative(3.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -3.9f, -1.62f)
                close()
                moveTo(13.0f, 16.9f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.75f, -0.73f)
                lineToRelative(2.15f, 2.14f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -3.9f, 1.62f)
                close()
                moveTo(16.17f, 14.75f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.9f, 13.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -1.62f, 3.9f)
                close()
                moveTo(16.9f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.73f, -1.75f)
                lineToRelative(2.14f, -2.15f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 1.62f, 3.9f)
                close()
            }
        }
        .build()
        return _bxColor!!
    }

private var _bxColor: ImageVector? = null
