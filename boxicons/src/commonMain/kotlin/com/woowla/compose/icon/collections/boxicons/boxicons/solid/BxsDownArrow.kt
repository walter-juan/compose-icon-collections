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

public val SolidGroup.BxsDownArrow: ImageVector
    get() {
        if (_bxsDownArrow != null) {
            return _bxsDownArrow!!
        }
        _bxsDownArrow = Builder(name = "BxsDownArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.178f, 19.569f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.644f, 0.0f)
                lineToRelative(9.0f, -13.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 21.0f, 5.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.822f, 1.569f)
                lineToRelative(9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bxsDownArrow!!
    }

private var _bxsDownArrow: ImageVector? = null
