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

public val SolidGroup.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) {
            return _folderMinus!!
        }
        _folderMinus = Builder(name = "FolderMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 21.0f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(22.5f, 7.343f, 21.157f, 6.0f, 19.5f, 6.0f)
                horizontalLineTo(14.121f)
                curveTo(13.922f, 6.0f, 13.732f, 5.921f, 13.591f, 5.78f)
                lineTo(11.47f, 3.659f)
                curveTo(11.048f, 3.237f, 10.475f, 3.0f, 9.879f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 3.0f, 1.5f, 4.343f, 1.5f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(9.0f, 12.75f)
                curveTo(8.586f, 12.75f, 8.25f, 13.086f, 8.25f, 13.5f)
                curveTo(8.25f, 13.914f, 8.586f, 14.25f, 9.0f, 14.25f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 14.25f, 15.75f, 13.914f, 15.75f, 13.5f)
                curveTo(15.75f, 13.086f, 15.414f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
