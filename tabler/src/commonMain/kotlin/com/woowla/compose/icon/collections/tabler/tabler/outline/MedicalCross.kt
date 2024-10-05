package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) {
            return _medicalCross!!
        }
        _medicalCross = Builder(name = "MedicalCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.535f)
                lineToRelative(3.928f, -2.267f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.366f, 0.366f)
                lineToRelative(1.0f, 1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, 1.366f)
                lineToRelative(-3.927f, 2.268f)
                lineToRelative(3.927f, 2.269f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.366f, 1.366f)
                lineToRelative(-1.0f, 1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.366f, 0.366f)
                lineToRelative(-3.928f, -2.269f)
                verticalLineToRelative(4.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.536f)
                lineToRelative(-3.928f, 2.268f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.366f, -0.366f)
                lineToRelative(-1.0f, -1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.366f, -1.366f)
                lineToRelative(3.927f, -2.268f)
                lineToRelative(-3.927f, -2.268f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.366f, -1.366f)
                lineToRelative(1.0f, -1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.366f, -0.366f)
                lineToRelative(3.928f, 2.267f)
                verticalLineToRelative(-4.535f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
