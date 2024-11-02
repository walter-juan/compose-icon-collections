package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ClipboardDocumentCheck: ImageVector
    get() {
        if (_clipboardDocumentCheck != null) {
            return _clipboardDocumentCheck!!
        }
        _clipboardDocumentCheck = Builder(name = "ClipboardDocumentCheck", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.502f, 6.0f)
                horizontalLineTo(11.248f)
                lineTo(11.25f, 6.0f)
                horizontalLineTo(14.63f)
                curveTo(16.492f, 6.003f, 18.0f, 7.513f, 18.0f, 9.375f)
                verticalLineTo(18.75f)
                curveTo(19.657f, 18.75f, 21.0f, 17.407f, 21.0f, 15.75f)
                verticalLineTo(6.108f)
                curveTo(21.0f, 4.603f, 19.875f, 3.297f, 18.336f, 3.169f)
                curveTo(18.112f, 3.15f, 17.888f, 3.133f, 17.663f, 3.118f)
                curveTo(17.163f, 2.156f, 16.158f, 1.5f, 15.0f, 1.5f)
                horizontalLineTo(13.5f)
                curveTo(12.342f, 1.5f, 11.337f, 2.156f, 10.837f, 3.118f)
                curveTo(10.612f, 3.133f, 10.388f, 3.15f, 10.164f, 3.169f)
                curveTo(8.662f, 3.294f, 7.554f, 4.541f, 7.502f, 6.0f)
                close()
                moveTo(13.5f, 3.0f)
                curveTo(12.672f, 3.0f, 12.0f, 3.672f, 12.0f, 4.5f)
                horizontalLineTo(16.5f)
                curveTo(16.5f, 3.672f, 15.828f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 9.375f)
                curveTo(3.0f, 8.339f, 3.839f, 7.5f, 4.875f, 7.5f)
                horizontalLineTo(14.625f)
                curveTo(15.66f, 7.5f, 16.5f, 8.339f, 16.5f, 9.375f)
                verticalLineTo(20.625f)
                curveTo(16.5f, 21.66f, 15.66f, 22.5f, 14.625f, 22.5f)
                horizontalLineTo(4.875f)
                curveTo(3.839f, 22.5f, 3.0f, 21.66f, 3.0f, 20.625f)
                verticalLineTo(9.375f)
                close()
                moveTo(12.586f, 13.969f)
                curveTo(12.844f, 13.645f, 12.792f, 13.173f, 12.469f, 12.914f)
                curveTo(12.145f, 12.656f, 11.673f, 12.708f, 11.414f, 13.031f)
                lineTo(8.938f, 16.127f)
                lineTo(8.03f, 15.22f)
                curveTo(7.737f, 14.927f, 7.263f, 14.927f, 6.97f, 15.22f)
                curveTo(6.677f, 15.513f, 6.677f, 15.987f, 6.97f, 16.28f)
                lineTo(8.47f, 17.78f)
                curveTo(8.621f, 17.931f, 8.828f, 18.011f, 9.041f, 17.999f)
                curveTo(9.254f, 17.987f, 9.452f, 17.885f, 9.586f, 17.719f)
                lineTo(12.586f, 13.969f)
                close()
            }
        }
        .build()
        return _clipboardDocumentCheck!!
    }

private var _clipboardDocumentCheck: ImageVector? = null
