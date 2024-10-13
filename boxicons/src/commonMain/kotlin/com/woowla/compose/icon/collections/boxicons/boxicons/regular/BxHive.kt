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

public val RegularGroup.BxHive: ImageVector
    get() {
        if (_bxHive != null) {
            return _bxHive!!
        }
        _bxHive = Builder(name = "BxHive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.895f, 7.553f)
                lineToRelative(-2.0f, -4.0f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 18.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.379f, 0.0f, -0.725f, 0.214f, -0.895f, 0.553f)
                lineTo(10.382f, 7.0f)
                lineTo(6.0f, 7.0f)
                curveToRelative(-0.379f, 0.0f, -0.725f, 0.214f, -0.895f, 0.553f)
                lineToRelative(-2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.895f)
                lineToRelative(2.0f, 4.0f)
                curveToRelative(0.17f, 0.338f, 0.516f, 0.552f, 0.895f, 0.552f)
                horizontalLineToRelative(4.382f)
                lineToRelative(1.724f, 3.447f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 13.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.379f, 0.0f, 0.725f, -0.214f, 0.895f, -0.553f)
                lineToRelative(2.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.895f)
                lineTo(19.118f, 12.0f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.001f, -0.894f)
                close()
                moveTo(13.618f, 5.0f)
                horizontalLineToRelative(3.764f)
                lineToRelative(1.5f, 3.0f)
                lineToRelative(-1.5f, 3.0f)
                horizontalLineToRelative(-3.764f)
                lineToRelative(-1.5f, -3.0f)
                lineToRelative(1.5f, -3.0f)
                close()
                moveTo(5.118f, 12.0f)
                lineTo(6.618f, 9.0f)
                horizontalLineToRelative(3.764f)
                lineToRelative(1.5f, 3.0f)
                lineToRelative(-1.5f, 3.0f)
                lineTo(6.618f, 15.0f)
                lineToRelative(-1.5f, -3.0f)
                close()
                moveTo(17.382f, 19.0f)
                horizontalLineToRelative(-3.764f)
                lineToRelative(-1.5f, -3.0f)
                lineToRelative(1.5f, -3.0f)
                horizontalLineToRelative(3.764f)
                lineToRelative(1.5f, 3.0f)
                lineToRelative(-1.5f, 3.0f)
                close()
            }
        }
        .build()
        return _bxHive!!
    }

private var _bxHive: ImageVector? = null
