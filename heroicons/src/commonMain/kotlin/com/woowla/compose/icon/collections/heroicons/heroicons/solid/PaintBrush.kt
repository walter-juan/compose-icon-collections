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

public val SolidGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.599f, 1.5f)
                curveTo(20.223f, 1.5f, 19.856f, 1.611f, 19.544f, 1.819f)
                lineTo(14.465f, 5.205f)
                curveTo(13.185f, 6.058f, 12.02f, 7.062f, 10.993f, 8.192f)
                curveTo(13.106f, 9.184f, 14.816f, 10.894f, 15.808f, 13.007f)
                curveTo(16.938f, 11.98f, 17.942f, 10.815f, 18.795f, 9.535f)
                lineTo(22.181f, 4.456f)
                curveTo(22.389f, 4.144f, 22.5f, 3.777f, 22.5f, 3.401f)
                curveTo(22.5f, 2.351f, 21.649f, 1.5f, 20.599f, 1.5f)
                close()
                moveTo(12.3f, 15.525f)
                curveTo(12.957f, 15.16f, 13.59f, 14.756f, 14.195f, 14.318f)
                curveTo(13.384f, 12.258f, 11.742f, 10.616f, 9.682f, 9.805f)
                curveTo(9.244f, 10.41f, 8.84f, 11.043f, 8.475f, 11.7f)
                lineTo(8.197f, 12.202f)
                curveTo(9.933f, 12.698f, 11.302f, 14.067f, 11.798f, 15.803f)
                lineTo(12.3f, 15.525f)
                close()
                moveTo(6.75f, 13.5f)
                curveTo(4.679f, 13.5f, 3.0f, 15.179f, 3.0f, 17.25f)
                curveTo(3.0f, 18.078f, 2.328f, 18.75f, 1.5f, 18.75f)
                curveTo(1.466f, 18.75f, 1.432f, 18.749f, 1.399f, 18.747f)
                curveTo(1.122f, 18.728f, 0.859f, 18.864f, 0.712f, 19.099f)
                curveTo(0.566f, 19.334f, 0.561f, 19.63f, 0.699f, 19.87f)
                curveTo(1.605f, 21.44f, 3.303f, 22.5f, 5.25f, 22.5f)
                curveTo(8.149f, 22.5f, 10.5f, 20.149f, 10.5f, 17.25f)
                curveTo(10.5f, 15.179f, 8.821f, 13.5f, 6.75f, 13.5f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
