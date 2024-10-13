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

public val SolidGroup.BxsCheckShield: ImageVector
    get() {
        if (_bxsCheckShield != null) {
            return _bxsCheckShield!!
        }
        _bxsCheckShield = Builder(name = "BxsCheckShield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.488f, 21.754f)
                curveToRelative(0.294f, 0.157f, 0.663f, 0.156f, 0.957f, -0.001f)
                curveToRelative(8.012f, -4.304f, 8.581f, -12.713f, 8.574f, -15.104f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, -0.596f, -0.903f)
                lineToRelative(-8.05f, -3.566f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, -0.813f, 0.001f)
                lineTo(3.566f, 5.747f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.592f, 0.892f)
                curveToRelative(-0.034f, 2.379f, 0.445f, 10.806f, 8.514f, 15.115f)
                close()
                moveTo(8.674f, 10.293f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.707f, 5.707f)
                lineToRelative(-3.707f, -3.707f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxsCheckShield!!
    }

private var _bxsCheckShield: ImageVector? = null
