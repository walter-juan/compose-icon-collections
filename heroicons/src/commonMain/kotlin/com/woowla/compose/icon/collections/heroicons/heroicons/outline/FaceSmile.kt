package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.FaceSmile: ImageVector
    get() {
        if (_faceSmile != null) {
            return _faceSmile!!
        }
        _faceSmile = Builder(name = "FaceSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.182f, 15.182f)
                curveTo(13.425f, 16.939f, 10.575f, 16.939f, 8.818f, 15.182f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
                moveTo(9.75f, 9.75f)
                curveTo(9.75f, 10.164f, 9.582f, 10.5f, 9.375f, 10.5f)
                curveTo(9.168f, 10.5f, 9.0f, 10.164f, 9.0f, 9.75f)
                curveTo(9.0f, 9.336f, 9.168f, 9.0f, 9.375f, 9.0f)
                curveTo(9.582f, 9.0f, 9.75f, 9.336f, 9.75f, 9.75f)
                close()
                moveTo(9.375f, 9.75f)
                horizontalLineTo(9.382f)
                verticalLineTo(9.765f)
                horizontalLineTo(9.375f)
                verticalLineTo(9.75f)
                close()
                moveTo(15.0f, 9.75f)
                curveTo(15.0f, 10.164f, 14.832f, 10.5f, 14.625f, 10.5f)
                curveTo(14.418f, 10.5f, 14.25f, 10.164f, 14.25f, 9.75f)
                curveTo(14.25f, 9.336f, 14.418f, 9.0f, 14.625f, 9.0f)
                curveTo(14.832f, 9.0f, 15.0f, 9.336f, 15.0f, 9.75f)
                close()
                moveTo(14.625f, 9.75f)
                horizontalLineTo(14.632f)
                verticalLineTo(9.765f)
                horizontalLineTo(14.625f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _faceSmile!!
    }

private var _faceSmile: ImageVector? = null
