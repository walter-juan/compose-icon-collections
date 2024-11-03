package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SuitDiamond: ImageVector
    get() {
        if (_suitDiamond != null) {
            return _suitDiamond!!
        }
        _suitDiamond = Builder(name = "SuitDiamond", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.384f, 1.226f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, -0.768f, 0.0f)
                lineToRelative(-4.56f, 6.468f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.0f, 0.612f)
                lineToRelative(4.56f, 6.469f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, 0.768f, 0.0f)
                lineToRelative(4.56f, -6.469f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.0f, -0.612f)
                close()
                moveTo(6.848f, 0.613f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, true, 2.304f, 0.0f)
                lineToRelative(4.56f, 6.468f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, true, 0.0f, 1.838f)
                lineToRelative(-4.56f, 6.468f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, true, -2.304f, 0.0f)
                lineTo(2.288f, 8.92f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, true, 0.0f, -1.838f)
                close()
            }
        }
        .build()
        return _suitDiamond!!
    }

private var _suitDiamond: ImageVector? = null
