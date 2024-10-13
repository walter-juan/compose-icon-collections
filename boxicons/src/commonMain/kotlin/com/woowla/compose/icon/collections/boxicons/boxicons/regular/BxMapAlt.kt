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

public val RegularGroup.BxMapAlt: ImageVector
    get() {
        if (_bxMapAlt != null) {
            return _bxMapAlt!!
        }
        _bxMapAlt = Builder(name = "BxMapAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.447f, 6.105f)
                lineToRelative(-6.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.895f, 0.0f)
                lineTo(9.0f, 5.882f)
                lineTo(3.447f, 3.105f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.379f, 0.214f, 0.725f, 0.553f, 0.895f)
                lineToRelative(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.895f, 0.0f)
                lineTo(15.0f, 18.118f)
                lineToRelative(5.553f, 2.776f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.972f, -0.043f)
                curveToRelative(0.295f, -0.183f, 0.475f, -0.504f, 0.475f, -0.851f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                close()
                moveTo(10.0f, 7.618f)
                lineToRelative(4.0f, -2.0f)
                verticalLineToRelative(10.764f)
                lineToRelative(-4.0f, 2.0f)
                lineTo(10.0f, 7.618f)
                close()
                moveTo(4.0f, 5.618f)
                lineTo(8.0f, 7.618f)
                verticalLineToRelative(10.764f)
                lineToRelative(-4.0f, -2.0f)
                lineTo(4.0f, 5.618f)
                close()
                moveTo(20.0f, 18.382f)
                lineTo(16.0f, 16.382f)
                lineTo(16.0f, 5.618f)
                lineToRelative(4.0f, 2.0f)
                verticalLineToRelative(10.764f)
                close()
            }
        }
        .build()
        return _bxMapAlt!!
    }

private var _bxMapAlt: ImageVector? = null
