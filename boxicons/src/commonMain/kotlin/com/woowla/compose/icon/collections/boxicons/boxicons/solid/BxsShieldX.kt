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

public val SolidGroup.BxsShieldX: ImageVector
    get() {
        if (_bxsShieldX != null) {
            return _bxsShieldX!!
        }
        _bxsShieldX = Builder(name = "BxsShieldX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.492f, 21.771f)
                curveToRelative(0.294f, 0.157f, 0.663f, 0.157f, 0.957f, -0.001f)
                curveToRelative(8.012f, -4.304f, 8.581f, -12.713f, 8.574f, -15.104f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, -0.596f, -0.903f)
                lineToRelative(-8.051f, -3.565f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, -0.813f, 0.001f)
                lineTo(3.57f, 5.765f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, -0.592f, 0.891f)
                curveToRelative(-0.034f, 2.379f, 0.445f, 10.806f, 8.514f, 15.115f)
                close()
                moveTo(8.293f, 9.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 10.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                lineTo(8.293f, 9.707f)
                close()
            }
        }
        .build()
        return _bxsShieldX!!
    }

private var _bxsShieldX: ImageVector? = null
