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

public val SolidGroup.BxsLeftArrow: ImageVector
    get() {
        if (_bxsLeftArrow != null) {
            return _bxsLeftArrow!!
        }
        _bxsLeftArrow = Builder(name = "BxsLeftArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.431f, 12.822f)
                lineToRelative(13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.569f, -0.823f)
                lineToRelative(-13.0f, 9.0f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, 0.0f, 1.645f)
                close()
            }
        }
        .build()
        return _bxsLeftArrow!!
    }

private var _bxsLeftArrow: ImageVector? = null
