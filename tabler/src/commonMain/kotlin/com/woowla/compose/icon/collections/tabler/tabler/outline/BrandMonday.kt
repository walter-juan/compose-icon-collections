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

public val OutlineGroup.BrandMonday: ImageVector
    get() {
        if (_brandMonday != null) {
            return _brandMonday!!
        }
        _brandMonday = Builder(name = "BrandMonday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.339f, 2.177f)
                lineToRelative(-4.034f, 7.074f)
                curveToRelative(-0.264f, 0.447f, -0.75f, 0.749f, -1.305f, 0.749f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.271f, -2.297f)
                lineToRelative(3.906f, -6.827f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.365f, -0.876f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.339f, 2.177f)
                lineToRelative(-4.034f, 7.074f)
                curveToRelative(-0.264f, 0.447f, -0.75f, 0.749f, -1.305f, 0.749f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.271f, -2.297f)
                lineToRelative(3.906f, -6.827f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.365f, -0.876f)
                close()
            }
        }
        .build()
        return _brandMonday!!
    }

private var _brandMonday: ImageVector? = null
