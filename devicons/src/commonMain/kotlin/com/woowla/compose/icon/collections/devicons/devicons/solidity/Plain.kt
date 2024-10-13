package com.woowla.compose.icon.collections.devicons.devicons.solidity

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SolidityGroup

public val SolidityGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF383838)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.32f, 0.0f)
                lineTo(22.76f, 36.58f)
                lineToRelative(20.57f, 36.56f)
                lineToRelative(20.56f, -36.56f)
                horizontalLineToRelative(41.14f)
                lineTo(84.46f, 0.0f)
                lineTo(43.32f, 0.0f)
                close()
                moveTo(84.66f, 54.86f)
                lineTo(64.1f, 91.42f)
                lineTo(22.95f, 91.42f)
                lineTo(43.52f, 128.0f)
                horizontalLineToRelative(41.15f)
                lineToRelative(20.58f, -36.58f)
                lineToRelative(-20.58f, -36.56f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
