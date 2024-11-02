package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.FaceSmile: ImageVector
    get() {
        if (_faceSmile != null) {
            return _faceSmile!!
        }
        _faceSmile = Builder(name = "FaceSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.375f, 8.25f)
                curveTo(8.834f, 8.25f, 8.547f, 8.669f, 8.439f, 8.884f)
                curveTo(8.309f, 9.145f, 8.25f, 9.452f, 8.25f, 9.75f)
                curveTo(8.25f, 10.048f, 8.309f, 10.355f, 8.439f, 10.616f)
                curveTo(8.547f, 10.831f, 8.834f, 11.25f, 9.375f, 11.25f)
                curveTo(9.916f, 11.25f, 10.203f, 10.831f, 10.311f, 10.616f)
                curveTo(10.441f, 10.355f, 10.5f, 10.048f, 10.5f, 9.75f)
                curveTo(10.5f, 9.452f, 10.441f, 9.145f, 10.311f, 8.884f)
                curveTo(10.203f, 8.669f, 9.916f, 8.25f, 9.375f, 8.25f)
                close()
                moveTo(13.689f, 8.884f)
                curveTo(13.797f, 8.669f, 14.084f, 8.25f, 14.625f, 8.25f)
                curveTo(15.166f, 8.25f, 15.453f, 8.669f, 15.561f, 8.884f)
                curveTo(15.691f, 9.145f, 15.75f, 9.452f, 15.75f, 9.75f)
                curveTo(15.75f, 10.048f, 15.691f, 10.355f, 15.561f, 10.616f)
                curveTo(15.453f, 10.831f, 15.166f, 11.25f, 14.625f, 11.25f)
                curveTo(14.084f, 11.25f, 13.797f, 10.831f, 13.689f, 10.616f)
                curveTo(13.559f, 10.355f, 13.5f, 10.048f, 13.5f, 9.75f)
                curveTo(13.5f, 9.452f, 13.559f, 9.145f, 13.689f, 8.884f)
                close()
                moveTo(15.712f, 15.712f)
                curveTo(16.005f, 15.419f, 16.005f, 14.945f, 15.712f, 14.652f)
                curveTo(15.419f, 14.359f, 14.944f, 14.359f, 14.652f, 14.652f)
                curveTo(13.187f, 16.116f, 10.813f, 16.116f, 9.348f, 14.652f)
                curveTo(9.055f, 14.359f, 8.581f, 14.359f, 8.288f, 14.652f)
                curveTo(7.995f, 14.945f, 7.995f, 15.419f, 8.288f, 15.712f)
                curveTo(10.338f, 17.763f, 13.662f, 17.763f, 15.712f, 15.712f)
                close()
            }
        }
        .build()
        return _faceSmile!!
    }

private var _faceSmile: ImageVector? = null
