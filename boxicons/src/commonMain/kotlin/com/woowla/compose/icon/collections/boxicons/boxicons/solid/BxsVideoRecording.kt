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

public val SolidGroup.BxsVideoRecording: ImageVector
    get() {
        if (_bxsVideoRecording != null) {
            return _bxsVideoRecording!!
        }
        _bxsVideoRecording = Builder(name = "BxsVideoRecording", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.434f)
                lineToRelative(-2.418f, -4.029f)
                arcTo(2.008f, 2.008f, 0.0f, false, false, 10.434f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.434f)
                lineToRelative(1.8f, 3.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(4.0f, 2.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-4.0f, 2.0f)
                lineTo(18.0f, 9.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsVideoRecording!!
    }

private var _bxsVideoRecording: ImageVector? = null
