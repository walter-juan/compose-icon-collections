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

public val SolidGroup.BxsZap: ImageVector
    get() {
        if (_bxsZap != null) {
            return _bxsZap!!
        }
        _bxsZap = Builder(name = "BxsZap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.98f, 11.802f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, -0.738f, -0.771f)
                lineToRelative(-6.86f, -1.716f)
                lineToRelative(2.537f, -5.921f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.317f, -1.192f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -1.234f, 0.024f)
                lineToRelative(-11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.39f, 1.744f)
                lineToRelative(6.719f, 1.681f)
                lineToRelative(-3.345f, 5.854f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 8.0f, 22.0f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.6f, -0.2f)
                lineToRelative(12.0f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.38f, -0.998f)
                close()
            }
        }
        .build()
        return _bxsZap!!
    }

private var _bxsZap: ImageVector? = null
